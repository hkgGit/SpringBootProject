package api;


import dto.TOrder;
import org.apache.ibatis.annotations.Select;

/**
 * @author aires.huang
 * @Description:
 * @date 2019/6/10 16:13
 * @since 0.1.0
 */

public interface OrderMapperApi {
    @Select("SELECT dict_text as String from t_sys_dict where id = #{id}")
    TOrder finId(int id);
}
