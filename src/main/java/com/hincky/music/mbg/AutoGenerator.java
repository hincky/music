package com.hincky.music.mbg;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

import java.util.Collections;

public class AutoGenerator {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/music", "root", "root")
                .globalConfig(builder -> { //全局配置
                    builder.outputDir("D://work//project//music//src//main//java//") //这一项必须设置，否则直接生成到盘目录下
//                            .fileOverride() // 覆盖已生成文件，可能是因为默认覆盖所以新版本mp已经弃用了
                            .author("hincky")
//                            .enableKotlin()  //这个开启后，生成的代码是kotlin格式而不是java，所以要注释掉
                            .enableSwagger() //这个开启后，生成的po代码带有ApiModel注释
                            .dateType(DateType.TIME_PACK)
                            .commentDate("yyyy-MM-dd");
                })
                .packageConfig(builder -> { //包配置
                    builder.parent("com.hincky.music")
//                            .moduleName("sys") //父包设置，设置后下面的所有包都生成在这个父包里面
                    .entity("po")
                    .service("service")
                    .serviceImpl("service.impl")
                    .mapper("dao")
                    .xml("mapper.xml")
                    .controller("controller")
                    .other("other")
                    .pathInfo(Collections.singletonMap(OutputFile.xml, "D://work//project//music//src//main//resources//mapper"));
                })
                .strategyConfig(builder -> { //策略配置
                    builder.addInclude("admin,collect,comment,consumer,list_song,rank_list,singer,song,song_list");// 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                //下面这个是模板引擎配置，如果是前后分离项目可以注释掉了
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
