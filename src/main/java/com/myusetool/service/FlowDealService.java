package com.myusetool.service;

import com.myusetool.bean.dto.FlowNode;
import com.myusetool.enmu.DealState;

import java.util.List;
import java.util.Map;

public interface FlowDealService {

    public DealState DealFlow(Map<?,?> map , List<FlowNode> list);

}
