package com.zs.json;

/**
 * @author zhangshuai_sx
 * @date 2019/3/24 12:18
 */

public class Entity {
    private String id;
    private String name;
    private Integer age;
    private boolean isChinese;
    private String description;
    private String nickName;

    public Entity(String id, String name, Integer age, boolean isChinese, String description, String nickName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isChinese = isChinese;
        this.description = description;
        this.nickName = nickName;
    }

    public Entity() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        if (isChinese() != entity.isChinese()) return false;
        if (getId() != null ? !getId().equals(entity.getId()) : entity.getId() != null) return false;
        if (getName() != null ? !getName().equals(entity.getName()) : entity.getName() != null) return false;
        if (getAge() != null ? !getAge().equals(entity.getAge()) : entity.getAge() != null) return false;
        if (getDescription() != null ? !getDescription().equals(entity.getDescription()) : entity.getDescription() != null)
            return false;
        return getNickName() != null ? getNickName().equals(entity.getNickName()) : entity.getNickName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        result = 31 * result + (isChinese() ? 1 : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getNickName() != null ? getNickName().hashCode() : 0);
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isChinese() {
        return isChinese;
    }

    public void setChinese(boolean chinese) {
        isChinese = chinese;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
