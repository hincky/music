package com.hincky.music.service.impl;

import com.hincky.music.po.ListSong;
import com.hincky.music.dao.ListSongMapper;
import com.hincky.music.service.IListSongService;
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
public class ListSongServiceImpl extends ServiceImpl<ListSongMapper, ListSong> implements IListSongService {

}
