package com.haoyukeji.water.service.impl;

import com.haoyukeji.water.entity.Account;
import com.haoyukeji.water.entity.AccountExample;
import com.haoyukeji.water.entity.TMinfo;
import com.haoyukeji.water.mapper.AccountMapper;
import com.haoyukeji.water.mapper.TMinfoMapper;
import com.haoyukeji.water.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private TMinfoMapper tMinfoMapper;

    /**
     * //根据手机号验证是否存在该账号
     * @param phone
     * @return
     */
    @Override
    public Account findByPhone(String phone) {
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andPhoneEqualTo(phone);

        List<Account> accountList = accountMapper.selectByExample(accountExample);
        if (accountList != null && !accountList.isEmpty()) {
            return accountList.get(0);
        }
        return null;
    }

    /**
     * 添加新账号
     * @param account
     */
    @Override
    public void saveNewAccount(Account account) {

        account.setCreateTime(new Date());
        account.setState(Account.ACCOUNT_NORMAL);
        accountMapper.insertSelective(account);

        logger.info("添加账号 {}" + account);

        TMinfo tminfo = new TMinfo();
        tminfo.setaId(account.getId());
        tminfo.setEletricmoney(0.0);
        tminfo.setEletricnumber(0.0);
        tminfo.setWatermoney(0.0);
        tminfo.setWaternumber(0.0);
        tminfo.setEnddate(new Date());

        tMinfoMapper.insertSelective(tminfo);

        logger.info("添加注册信息 {}" + tminfo);


    }
}
