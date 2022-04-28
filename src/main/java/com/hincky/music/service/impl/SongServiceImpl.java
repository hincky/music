package com.hincky.music.service.impl;

import com.hincky.music.po.Song;
import com.hincky.music.dao.SongMapper;
import com.hincky.music.service.ISongService;
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
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements ISongService {

}
