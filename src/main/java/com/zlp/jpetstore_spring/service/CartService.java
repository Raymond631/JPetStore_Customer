package com.zlp.jpetstore_spring.service;

import com.zlp.jpetstore_spring.entity.Cart;

import java.util.List;

/**
 * @author Raymond Li
 * @create 2023-03-07 22:13
 * @description
 */
public interface CartService {

    public void addCartItem(String userId, Cart cart);// 增


    public List<Cart> selectCartList(String userId);// 查

    public int removeCartItem(int cartItemId);// 删

    public int updateItemQuantity(int cartItemId, int quantity);// 改

}
