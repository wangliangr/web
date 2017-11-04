package com.webs.service;

import com.webs.domain.User;
import com.webs.exception.UserExistException;

/**
 * Created by windows10 on 2017/10/27.
 */
public interface BuinessService {
    void regiest(User user) throws UserExistException;
}
