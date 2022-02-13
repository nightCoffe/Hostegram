package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:userRemote.properties"})
public interface UserRemoteConfig extends Config {

    @Key("remoteLogin")
    String remoteLogin();

    @Key("remotePassword")
    String remotePassword();
}
