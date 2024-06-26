package test;

import org.aeonbits.owner.Config;

@Config.Sources({ "file:src/main/resources/config.properties" })
public interface ApplicationConfig extends Config {

    @Config.Key("server.basespoon")
    String baseSpoon();

    @Config.Key("server.hostspoon")
    String hostSpoon();

    @Config.Key("server.hostfaker")
    String hostFaker();

    @Config.Key("server.basefaker1")
    String baseFaker1();

    @Config.Key("server.basefaker2")
    String baseFaker2();

    @Config.Key("server.basefaker3")
    String baseFaker3();

    @Config.Key("server.basefaker4")
    String baseFaker4();

    @Config.Key("server.hostwhether")
    String hostWhether();

    @Config.Key("server.basewhether1")
    String baseWhether1();

    @Config.Key("server.basewhether2")
    String baseWhether2();

    @Config.Key("server.basewhether3")
    String baseWhether3();
}
