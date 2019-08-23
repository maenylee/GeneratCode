/**
 * FileName: AutoGeneratorMain
 * Author:   Danny
 * Date:     2019/8/23 15:50
 * Description: 自动生成器主函数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.heart.autogenerator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.heart.autogenerator.utils.AutoGeneratorUtil;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自动生成器主函数〉
 *
 * @author Danny
 * @create 2019/8/23
 * @since 1.0.0
 */
public class AutoGeneratorMain {
    public static void main(String[] args){
        //要生成实体类表名
        String[] tablesName = new String[]{};
        AutoGenerator mpg = AutoGeneratorUtil.autoGererate(tablesName);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://172.16.0.34:3306/blueheart?useUnicode=true&characterEncoding=utf8");
        dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("2011");
        mpg.setDataSource(dsc);
        mpg.execute();
    }
}