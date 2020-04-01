package com.BoozeBuddies.Bar.Interface;

import com.BoozeBuddies.Bar.Model.enitities.Bar;
import com.BoozeBuddies.Bar.Model.viewmodels.BarCollection;

import java.util.List;

public interface IBarCollectionRepo {
    Bar AddBar(Bar bar);
    Bar EditBar(Bar bar);
    Bar DeleteBar(Bar bar);
    BarCollection GetAllBars();
}
