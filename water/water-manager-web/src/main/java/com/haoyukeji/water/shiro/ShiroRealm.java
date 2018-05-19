package com.haoyukeji.water.shiro;


import com.haoyukeji.water.entity.Account;
import com.haoyukeji.water.service.LoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    @Autowired
    private LoginService loginService;

    /**
     * 角色和权限
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 登录
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String phone = usernamePasswordToken.getUsername();
        if (phone != null) {
            Account account = loginService.findByPhone(phone);
            if (account == null) {
                throw new UnknownAccountException("找不到该账号:" + phone);
            }else {
                logger.info("{} 登录成功 {}",account,usernamePasswordToken.getHost());

                return new SimpleAuthenticationInfo(account,account.getPassword(),getName());
            }
        }
        return null;
    }
}
