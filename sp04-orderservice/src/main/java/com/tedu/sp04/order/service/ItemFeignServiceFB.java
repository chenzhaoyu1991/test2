package com.tedu.sp04.order.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;
@Component
public class ItemFeignServiceFB implements ItemFeignService{

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		if(Math.random()<0.5) {
			return JsonResult.ok().data(
					Arrays.asList(new Item[] {
							new Item(1,"abc",20),
							new Item(2,"def",40),
							new Item(3,"ghi",30),
							new Item(4,"jkl",60),
							new Item(5,"nmw",10)
							
					})
					
				);
		}
		return JsonResult.err("无法获取订单商品列表");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		return JsonResult.err("无法获取商品库存");
	}

}
