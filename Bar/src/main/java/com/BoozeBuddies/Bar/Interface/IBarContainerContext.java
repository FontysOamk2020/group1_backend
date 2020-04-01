package com.BoozeBuddies.Bar.Interface;

import com.BoozeBuddies.Bar.Model.enitities.Bar;

import java.util.List;

public interface IBarContainerContext {
    Bar AddBar(Bar bar);
    Bar EditBar(Bar bar);
    Bar DeleteBar(Bar bar);
    List<Bar> GetAllBar();
}
