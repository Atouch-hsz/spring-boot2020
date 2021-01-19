package com.hsz.boot.controller.centredata;

import cn.hutool.Hutool;
import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSON;
import com.hsz.bootentity.bo.ConsInfoQueryDataBO;
import com.hsz.bootentity.bo.DataCenterQueryBaseBO;
import com.hsz.bootentity.bo.MonthlyBillQueryDataBO;
import com.hsz.bootentity.vo.*;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author created by hsz 2021/1/11 14:48
 * 模拟数据中台接口数据
 */
@RestController
@RequestMapping("/dataApiConfig-server/apiServer")
public class CentreDataController {
    @PostMapping("/API20201111004")
    public DataCenterResBaseVO<MonthlyBillResDataDetailVO> getMonthlyBill(@RequestBody DataCenterQueryBaseBO<MonthlyBillQueryDataBO> condition) {
        System.out.println("getMonthlyBill入参：" + JSON.toJSONString(condition));
        DataCenterResBaseVO<MonthlyBillResDataDetailVO> result = new DataCenterResBaseVO<>();
        if (condition != null && condition.getData() != null && !CollectionUtils.isEmpty(condition.getData().getConsNo())) {
            DataCenterResDataBaseVO<MonthlyBillResDataDetailVO> data = new DataCenterResDataBaseVO<>();
            data.setRtnCode("1000");
            data.setRtnMsg("测试环境模拟数据");
            List<MonthlyBillResDataDetailVO> list = new ArrayList<>();
            for (String consNo : condition.getData().getConsNo()) {
                MonthlyBillResDataDetailVO vo = new MonthlyBillResDataDetailVO();
                vo.setAvgPrc(RandomUtil.randomBigDecimal(new BigDecimal(0.5), new BigDecimal(0.99)));
                vo.setAmtMonth(condition.getData().getAmtMonth());
                vo.setConsNo(consNo);
                vo.setSettleAmt(RandomUtil.randomBigDecimal(new BigDecimal(10000), new BigDecimal(1000000)));
                vo.setSettlePq(vo.getSettleAmt().multiply(RandomUtil.randomBigDecimal(new BigDecimal(0.3), new BigDecimal(0.8))));
                list.add(vo);
            }
            data.setDetail(list);
            result.setData(data);
        }
        return result;
    }

    @PostMapping("/API20201112001")
    public DataCenterResBaseVO<ConsInfoResDataDetailVO> getConsumerInfo(@RequestBody DataCenterQueryBaseBO<ConsInfoQueryDataBO> condition) {
        System.out.println("getConsumerInfo入参：" + JSON.toJSONString(condition));
        DataCenterResBaseVO<ConsInfoResDataDetailVO> result = new DataCenterResBaseVO<>();
        if (condition != null && condition.getData() != null && !CollectionUtils.isEmpty(condition.getData().getConsNo())) {
            DataCenterResDataBaseVO<ConsInfoResDataDetailVO> data = new DataCenterResDataBaseVO<>();
            data.setRtnCode("1000");
            data.setRtnMsg("测试环境模拟数据");
            List<ConsInfoResDataDetailVO> list = new ArrayList<>();
            for (String consNo : condition.getData().getConsNo()) {
                ConsInfoResDataDetailVO vo = new ConsInfoResDataDetailVO();
                vo.setConsNo(consNo);
                vo.setConsName(RandomUtil.randomStringUpper(20));
                vo.setTradeCode("钢铁");
                vo.setTradeCodeValue("123");
                vo.setConsSortCode("01");
                vo.setElecContactor("张三");
                vo.setElecContactorMobile("13" + RandomUtil.randomNumbers(9));
                vo.setAccountContactor("李四");
                vo.setAccountContactorMobile("13" + RandomUtil.randomNumbers(9));
                list.add(vo);
            }
            data.setDetail(list);
            result.setData(data);
        }
        return result;
    }

    @PostMapping("/API20201111003")
    public DataCenterResBaseVO<MonthlyPeakAndValleyRatioResDataDetailVO> getMonthlyPeakPower(@RequestBody DataCenterQueryBaseBO<MonthlyBillQueryDataBO> condition) {
        System.out.println("getMonthlyPeakPower入参：" + JSON.toJSONString(condition));
        DataCenterResBaseVO<MonthlyPeakAndValleyRatioResDataDetailVO> result = new DataCenterResBaseVO<>();
        if (condition != null && condition.getData() != null && !CollectionUtils.isEmpty(condition.getData().getConsNo())) {
            DataCenterResDataBaseVO<MonthlyPeakAndValleyRatioResDataDetailVO> data = new DataCenterResDataBaseVO<>();
            data.setRtnCode("1000");
            data.setRtnMsg("测试环境模拟数据");
            List<MonthlyPeakAndValleyRatioResDataDetailVO> list = new ArrayList<>();
            for (String consNo : condition.getData().getConsNo()) {
                MonthlyPeakAndValleyRatioResDataDetailVO vo = new MonthlyPeakAndValleyRatioResDataDetailVO();
                vo.setConsNo(consNo);
                vo.setAmtMonth(condition.getData().getAmtMonth());
                //vo.setMrDate("钢铁");
                vo.setPq1(RandomUtil.randomBigDecimal(new BigDecimal(1000), new BigDecimal(100000)));
                vo.setPq2(RandomUtil.randomBigDecimal(new BigDecimal(1000), new BigDecimal(100000)));
                vo.setPq3(RandomUtil.randomBigDecimal(new BigDecimal(1000), new BigDecimal(100000)));
                vo.setPq4(RandomUtil.randomBigDecimal(new BigDecimal(1000), new BigDecimal(100000)));
                list.add(vo);
            }
            data.setDetail(list);
            result.setData(data);
        }
        return result;
    }

    @PostMapping("/API20201111007")
    public DataCenterResBaseVO<MonthlyElectricityBillCompositionResDataDetailVO> getMonthlyElectricityBillDetail(@RequestBody DataCenterQueryBaseBO<MonthlyBillQueryDataBO> condition) {
        System.out.println("getMonthlyElectricityBillDetail入参：" + JSON.toJSONString(condition));
        DataCenterResBaseVO<MonthlyElectricityBillCompositionResDataDetailVO> result = new DataCenterResBaseVO<>();
        if (condition != null && condition.getData() != null && !CollectionUtils.isEmpty(condition.getData().getConsNo())) {
            DataCenterResDataBaseVO<MonthlyElectricityBillCompositionResDataDetailVO> data = new DataCenterResDataBaseVO<>();
            data.setRtnCode("1000");
            data.setRtnMsg("测试环境模拟数据");
            List<MonthlyElectricityBillCompositionResDataDetailVO> list = new ArrayList<>();
            for (String consNo : condition.getData().getConsNo()) {
                MonthlyElectricityBillCompositionResDataDetailVO vo = new MonthlyElectricityBillCompositionResDataDetailVO();
                vo.setConsNo(consNo);
                vo.setAmtMonth(condition.getData().getAmtMonth());
                vo.setKwhAmt(RandomUtil.randomBigDecimal(new BigDecimal(300000), new BigDecimal(500000)));
                vo.setAdjAmt(RandomUtil.randomBigDecimal(new BigDecimal(-30000), new BigDecimal(-10000)));
                vo.setBaseAmt(RandomUtil.randomBigDecimal(new BigDecimal(50000), new BigDecimal(100000)));
                vo.setPlAmt(RandomUtil.randomBigDecimal(new BigDecimal(10000), new BigDecimal(20000)));
                list.add(vo);
            }
            data.setDetail(list);
            result.setData(data);
        }
        return result;
    }

    @PostMapping("/API20201120001")
    public DataCenterResBaseVO<MonthlyMarketingVO> getMonthlyMarketingData(@RequestBody DataCenterQueryBaseBO<MonthlyBillQueryDataBO> condition) {
        System.out.println("getMonthlyMarketingData入参：" + JSON.toJSONString(condition));
        DataCenterResBaseVO<MonthlyMarketingVO> result = new DataCenterResBaseVO<>();
        if (condition != null && condition.getData() != null && !CollectionUtils.isEmpty(condition.getData().getConsNo())) {
            DataCenterResDataBaseVO<MonthlyMarketingVO> data = new DataCenterResDataBaseVO<>();
            data.setRtnCode("1000");
            data.setRtnMsg("测试环境模拟数据");
            List<MonthlyMarketingVO> list = new ArrayList<>();
            for (String consNo : condition.getData().getConsNo()) {
                for (int i = 0; i < 4; i++) {
                    MonthlyMarketingVO vo = new MonthlyMarketingVO();
                    vo.setConsNo(consNo);
                    vo.setAmtMonth(condition.getData().getAmtMonth());
                    switch (i) {
                        case 0 :  vo.setTypeFee("偏差考核费");
                        case 1:  vo.setTypeFee("违约费");
                        case 2 :  vo.setTypeFee("交易费");
                        case 3 :  vo.setTypeFee("输配电费");
                    }
                    vo.setElePq(RandomUtil.randomBigDecimal(new BigDecimal(10000), new BigDecimal(100000)));
                    vo.setElePrice(RandomUtil.randomBigDecimal());
                    vo.setFee(RandomUtil.randomBigDecimal(new BigDecimal(5000), new BigDecimal(50000)));
                    list.add(vo);
                }
            }
            data.setDetail(list);
            result.setData(data);
        }
        return result;
    }
}
