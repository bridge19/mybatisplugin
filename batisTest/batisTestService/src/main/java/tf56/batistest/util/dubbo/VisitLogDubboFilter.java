package tf56.batistest.util.dubbo;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.fastjson.JSON;

/**
 * dubbo打点过滤器，用于记录服务提供方被访问时的相关信息。
 * 
 * @author zhuhanbing 
 * @author da.dong
 */
@Activate(group = Constants.PROVIDER)
public class VisitLogDubboFilter implements Filter {

    private final Logger LOGGER = LoggerFactory.getLogger(VisitLogDubboFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String serviceName = invocation.getAttachment("interface");
        String methodName = invocation.getMethodName();

        String url = serviceName + "." + methodName;
        Object[] params = invocation.getArguments();

        long startTime = System.currentTimeMillis();
        Result result = invoker.invoke(invocation);
        long execTime = System.currentTimeMillis() - startTime;
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("__execTime", execTime);// 执行时间
        paramMap.put("__url", url);// 访问地址
        paramMap.put("__params", params);// 入参
        paramMap.put("__result", result);// 返回值

        // 打印日志
        LOGGER.info(JSON.toJSONString(paramMap));
        return result;
    }
}
