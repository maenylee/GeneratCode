/**
 * FileName: AutoGeneratorUtil
 * Author:   Danny
 * Date:     2019/8/23 15:51
 * Description: 代码自动生成器工具
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.heart.autogenerator.utils;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈代码自动生成器工具〉
 *
 * @author Danny
 * @create 2019/8/23
 * @since 1.0.0
 */
public class AutoGeneratorUtil {
    public static AutoGenerator autoGererate(String[] tableNames){
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("Danny");
        gc.setOpen(true);
        gc.setBaseResultMap(true);
        mpg.setGlobalConfig(gc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.heart.blue");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        mpg.setCfg(cfg);
        mpg.setStrategy(setStrategy(tableNames));
        return mpg;
    }

    /**
     * 策略配置
     * @return
     */
    public static StrategyConfig setStrategy(String ...tableName){
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setEntityColumnConstant(true);
        strategy.setEntityBuilderModel(true);
        strategy.setEntityTableFieldAnnotationEnable(true);
        strategy.setInclude(tableName);
        strategy.setControllerMappingHyphenStyle(true);
        return strategy;
    }
}