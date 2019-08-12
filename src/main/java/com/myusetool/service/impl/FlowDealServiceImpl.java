package com.myusetool.service.impl;

import com.myusetool.dao.dto.FlowNode;
import com.myusetool.enmu.DealState;
import com.myusetool.enmu.FlowNodeConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Service("flowDealService")
public class FlowDealServiceImpl {
    Logger logger = LoggerFactory.getLogger(getClass());

    public DealState DealFlow(Map<?,?> map , List<FlowNode> list){
       //初始化流程处理中
        DealState dealState =DealState.dealing;
        //重排流程顺序
        sort(list);
        //循环流程
        for (int i = 0; i < list.size(); i++) {
            FlowNode flowNode  = list.get(i);
            switch (FlowNodeConfig.getConstant(flowNode.getFlowNodeId())){

                case ONE :

                    break;

                case TWO:

            }

        }


        return dealState;
    }

    private  void sort(List<FlowNode> list){
        try {
            Collections.sort(list, new Comparator<FlowNode>() {
                @Override
                public int compare(FlowNode o1, FlowNode o2) {
                    String str1 = o1.getFlowNodeId();
                    String str2 = o2.getFlowNodeId();
                    return str1.compareTo(str2);
                }
            });
        }catch (Exception e){
            logger.error("",e);
        }
    }

}
