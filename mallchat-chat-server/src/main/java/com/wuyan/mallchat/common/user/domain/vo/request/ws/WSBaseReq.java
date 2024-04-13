/**
 * z作者:无言
 * 版本:1.0
 * 2024-4-12 15:14
 */


package com.wuyan.mallchat.common.user.domain.vo.request.ws;


import lombok.Data;

/**
 * websocket前端请求体
 */
@Data
public class WSBaseReq {
    /**
     * 请求类型：1.请求登录二维码 2.心跳检测
     * @see com.wuyan.mallchat.common.user.domain.enums.WSReqTypeEnum
     */
    private Integer type;

    /**
     * 每个请求包具体的数据，类型不同结果不同
     */
    private String data;
}
