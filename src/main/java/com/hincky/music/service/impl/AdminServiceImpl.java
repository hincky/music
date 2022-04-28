package com.hincky.music.service.impl;

import com.hincky.music.po.Admin;
import com.hincky.music.dao.AdminMapper;
import com.hincky.music.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hincky
 * @since 2022-04-28
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
