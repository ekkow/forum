package com.example.arknightsdemo.model;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParameter<T> {
    private int pageNumber = 1;
    private int pageSize = 20;
    private boolean asc = false;
    private String sort = "id";


    public Page<T> getPage(){
        Page<T> page = new Page<T>();
        page.setCurrent(this.pageNumber);
        page.setSize(this.pageSize);
        page.addOrder(this.asc ? OrderItem.asc(this.sort) : OrderItem.desc(this.sort));
        return page;
    }

}
