package com.haoyukeji.water.service;

import com.haoyukeji.water.entity.Account;

import java.util.List;

public interface AccountService {

    Account findById(Integer id);

    List<Account> findAll();
}
