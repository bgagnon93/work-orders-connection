package com.bgagnon.agent;

public class AgentBuilder {

    Agent agent;

    public AgentBuilder() {
        this.agent = new Agent();
    }

    public AgentBuilder code(String code) {
        agent.setCode(code);
        return this;
    }

    public AgentBuilder name(String name) {
        agent.setName(name);
        return this;
    }

    public AgentBuilder workingArea(String workingArea) {
        agent.setWorkingArea(workingArea);
        return this;
    }

    public AgentBuilder commission(Float commission) {
        agent.setCommission(commission);
        return this;
    }

    public AgentBuilder phone(String phone) {
        agent.setPhone(phone);
        return this;
    }

    public AgentBuilder country(String country) {
        agent.setCountry(country);
        return this;
    }

    public Agent build() {
        return this.agent;
    }
}
