package factorymethod.after2;

import java.util.Calendar;

// 2개의 Scheduler를 Singleton으로 구현한 경우
public class SchedulerFactory {
	public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
		ElevatorScheduler scheduler = null ;
		switch ( strategyID ) {
			case RESPONSE_TIME : scheduler = ResponseTimeScheduler.getInstance() ; break ;
			case THROUGHPUT : scheduler = ThroughputScheduler.getInstance() ; break ;
			case DYNAMIC : {
				int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY) ;
				if ( hour < 12 ) // 오전
					scheduler = ResponseTimeScheduler.getInstance() ;
				else // 오후
					scheduler = ThroughputScheduler.getInstance() ;
				break ;
			}
		} 
		return scheduler ;
	}
}
