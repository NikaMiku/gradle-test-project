package ru.netology;

import java.util.UUID;

public class Db {
    private DbSetting dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID.randomUUID());
    }

    public DbSetting getDbSetting() {
        return dbSetting;
    }

    public MyEntity getMyEntry() {
        return myEntity;
    }

    public void setMyEntry(MyEntity myEntry) {
        this.myEntity = myEntry;
    }
}
