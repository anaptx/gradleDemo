package com.example.demo.command;

import net.hasor.core.ApiBinder;
import net.hasor.core.DimModule;
import net.hasor.db.JdbcModule;
import net.hasor.db.Level;
import net.hasor.spring.SpringModule;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author fengqian07
 * @Description
 * @date 2020/8/19 19:16
 */
@DimModule
@Component
public class HasorTest implements SpringModule {
    @Resource
    private DataSource dataSource = null;

    @Override
    public void loadModule(ApiBinder apiBinder) throws Throwable {
        apiBinder.installModule(
                new JdbcModule(Level.Full, this.dataSource));
    }
}
