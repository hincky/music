package com.hincky.music.service.impl;

import com.hincky.music.po.Comment;
import com.hincky.music.dao.CommentMapper;
import com.hincky.music.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
