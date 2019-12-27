package Controller;

import api.OrderMapperApi;
import dto.TOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/provider/order")
public class OrderProviderController {
    @Resource
    OrderMapperApi orderMapperApi;

    @GetMapping("get/{id}")
    public TOrder getOrder(@PathVariable int id){
        return orderMapperApi.finId(id);
    }
}
