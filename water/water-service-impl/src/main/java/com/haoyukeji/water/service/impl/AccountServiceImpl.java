package com.haoyukeji.water.service.impl;

import com.haoyukeji.water.entity.Account;
import com.haoyukeji.water.entity.AccountExample;
import com.haoyukeji.water.mapper.AccountMapper;
import com.haoyukeji.water.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findById(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.selectByExample(new AccountExample());
    }
}
