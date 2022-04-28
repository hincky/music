package com.hincky.music.service.impl;

import com.hincky.music.po.SongList;
import com.hincky.music.dao.SongListMapper;
import com.hincky.music.service.ISongListService;
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
public class SongListServiceImpl extends ServiceImpl<SongListMapper, SongList> implements ISongListService {

}
