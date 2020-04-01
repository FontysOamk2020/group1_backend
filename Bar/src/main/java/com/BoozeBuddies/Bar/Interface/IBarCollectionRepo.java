package com.BoozeBuddies.Bar.Interface;

import com.BoozeBuddies.Bar.Model.entities.Bar;
import com.BoozeBuddies.Bar.Model.viewmodels.BarCollection;

public interface IBarCollectionRepo {
    Bar AddBar(Bar bar);
    Bar EditBar(Bar bar);
    Bar DeleteBar(Bar bar);
    BarCollection GetAllBars();
}
