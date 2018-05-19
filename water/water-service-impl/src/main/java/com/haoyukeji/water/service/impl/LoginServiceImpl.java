package com.haoyukeji.water.service.impl;

import com.haoyukeji.water.entity.Account;
import com.haoyukeji.water.entity.AccountExample;
import com.haoyukeji.water.mapper.AccountMapper;
import com.haoyukeji.water.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AccountMapper accountMapper;

    /*@Override
    public boolean login(TUinfo tuinfo) {
        return false;
    }

    @Override
    public void register(TUinfo tuinfo) {

    }

    @Override
    public void register(TMinfo tminfo) {

    }*/

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
}
