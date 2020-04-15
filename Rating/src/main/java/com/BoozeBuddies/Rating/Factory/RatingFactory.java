package com.BoozeBuddies.Rating.Factory;

import com.BoozeBuddies.Rating.Dal.Context.RatingContextMySql;
import com.BoozeBuddies.Rating.Dal.Repository.RatingRepository;
import com.BoozeBuddies.Rating.Interface.IRatingContext;

public class RatingFactory {

    public IRatingContext createBarRepoHibernate() { return new RatingRepository(new RatingContextMySql()); }

    public IRatingContext createUserRepo() { return new RatingRepository(new RatingContextMySql()); }
}
