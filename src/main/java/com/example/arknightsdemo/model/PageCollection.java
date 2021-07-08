package com.example.arknightsdemo.model;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


@Data
public class PageCollection<T> {

    @ApiModelProperty("当前第几页，从1开始")
    private long pageNumber;

    @ApiModelProperty("一共多少记录")
    private long totalCount;

    @ApiModelProperty("每页记录数")
    private long pageSize;

    @ApiModelProperty("内部包裹的数据")
    private List<T> records;

    public PageCollection(IPage<T> pageList) {
        this.totalCount = pageList.getTotal();
        this.records = pageList.getRecords();
        this.pageSize = pageList.getSize();
        this.pageNumber = pageList.getCurrent();
    }

}
