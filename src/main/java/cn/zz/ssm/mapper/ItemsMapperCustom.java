package cn.zz.ssm.mapper;

import java.util.List;

import cn.zz.ssm.po.ItemsCustom;
import cn.zz.ssm.po.ItemsQueryVo;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}