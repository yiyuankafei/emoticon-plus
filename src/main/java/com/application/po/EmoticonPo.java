package com.application.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


@Data
@TableName("emoticon")
public class EmoticonPo {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String tag;

    private String url;

    private Date createTime;

}
