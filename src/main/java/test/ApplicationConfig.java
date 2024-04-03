package test;

import org.aeonbits.owner.Config;

@Config.Sources({ "file:src/main/resources/config.properties" })
public interface ApplicationConfig extends Config {

    @Config.Key("server.base1")
    String base1();
    @Config.Key("server.base2")
    String base2();

    @Config.Key("server.host1")
    String host1();

    @Config.Key("server.host2")
    String host2();
}
