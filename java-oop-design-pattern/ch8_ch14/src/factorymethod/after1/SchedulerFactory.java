package factorymethod.after1;

import java.util.Calendar;

// 정적 크래스를 이용한 singleton 패턴이라고 볼 수 있음
public class SchedulerFactory {
	public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
		ElevatorScheduler scheduler = null ;
		switch ( strategyID ) {
			case RESPONSE_TIME : scheduler = new ResponseTimeScheduler() ; break ;
			case THROUGHPUT : scheduler = new ThroughputScheduler() ; break ;
			case DYNAMIC : {
				int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY) ;
				if ( hour < 12 ) // 오전
					scheduler = new ResponseTimeScheduler() ;
				else // 오후
					scheduler = new ThroughputScheduler() ;
				break ;
			}
		} 
		return scheduler ;
	}
}
