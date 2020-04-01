package com.BoozeBuddies.Bar.Interface;

import com.BoozeBuddies.Bar.Model.Bar;

import java.util.List;

public interface IBarContainerContext {
    Bar AddBar();
    Bar EditBar();
    Bar DeleteBar();
    List<Bar> GetAllBar();
}
