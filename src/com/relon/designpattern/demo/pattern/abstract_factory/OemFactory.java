package com.relon.designpattern.demo.pattern.abstract_factory;

/**
 * 假设有这样一家加工厂，其可以代加工小米的各种产品，也可以代工华为的产品，假定可以代工手机和平板，那么就可以这样定义
 */
public interface OemFactory {
    /**
     * 生产手机
     */
    MobilePhone produceMobile();
    /**
     * 生产平板
     */
    Tablet produceTablet();
}
