package com.example.zookser.demo.common.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//1.创建路由模型
@Data
public class GatewayRouteDefinition {
    //路由的Id
    private String id;
    //路由断言集合配置
    private List<GatewayPredicateDefinition> predicates = new ArrayList<>();
    //路由过滤器集合配置
    private List<GatewayFilterDefinition> filters = new ArrayList<>();
    //路由规则转发的目标uri
    private String uri;
    //路由执行的顺序
    private int order = 0;
    //此处省略get和set方法
}