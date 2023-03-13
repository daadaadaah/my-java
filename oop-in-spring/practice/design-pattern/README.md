1. 어댑터 패턴(Adapter Pattern)
- 2개를 붙이려고 하는데, 서로 API의 sync가 안 맞을 때, sync를 맞추기 위한 패턴
2. 프록시 패턴(Proxy Pattern)
- 2개 사이에서 추가적인 작업을 하고 싶을 때 사용
- [Spring에서 발견한 디자인패턴_Proxy Pattern](https://sabarada.tistory.com/20)

3. 싱글턴 패턴(Singleton Pattern)
- 1개의 객체만 만들어서 재사용하고 싶을 때 사용하는 패턴
- [Spring에서 발견한 디자인패턴_Singleton Pattern](https://sabarada.tistory.com/25)
4. 팩터리 메서드 패턴(Factory Method Pattern) 
- 객체의 다형성을 활용해서 객체를 생성하고 싶을 때 사용하는 패턴으로, 어떤 클래스의 인스턴스를 만들지를 서브 클래스에서 결정하게 함으로써, 새로운 구현 클래스가 추가되어도 기존 Factory 코드의 수정 없이 새로운 Factory 를 추가할 수 있게 해준다.
- 메서드가 팩터리 역할을 함.

5. 데코레이터 패턴(Decorator Pattern)
- 여러개의 기능을 조합하고 사용하고 싶을 때 사용하는 패턴
- [Java에서 발견한 디자인패턴_Decorator Pattern](https://sabarada.tistory.com/59)
6. 전략 패턴(Strategy Pattern)
- 도메인에 필요한 정책이 추가됨에 
- [스프링에서 전략 패턴 사용된 곳](https://sabarada.tistory.com/32)


7. 템플릿 메서드 패턴(Template Method Pattern)
- 전체적으로 동일하면서 부분적으로는 다른 기능으로 구성된 메서드가 있을 때, 메서드의 코드 중복을 최소화하고자 할 때 사용하는 패턴
- 메서드를 활용해서 중복된 코드를 템플릿화하는 패턴
- [Spring에서 발견한 디자인패턴_template method pattern](https://sabarada.tistory.com/19)
8. 템플릿 콜백 패턴(Template Callback Pattern - 견본/회신 패턴)
- 

9. 스프링이 사랑한 다른 패턴들
# Reference
- https://incheol-jung.gitbook.io/docs/study/undefined/undefined-2/undefined


```java
@SpringBootApplication
public class PracticeHelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeHelloSpringApplication.class, args);
	}
}
```

```java
public class SpringApplication {
    public static ConfigurableApplicationContext run(Class<?> primarySource, String... args) {
        return run(new Class<?>[] { primarySource }, args);
    }

    public static ConfigurableApplicationContext run(Class<?>[] primarySources, String[] args) {
        return new SpringApplication(primarySources).run(args);
    }

    public ConfigurableApplicationContext run(String... args) {
        long startTime = System.nanoTime();
        DefaultBootstrapContext bootstrapContext = createBootstrapContext();
        ConfigurableApplicationContext context = null;
        configureHeadlessProperty();
        SpringApplicationRunListeners listeners = getRunListeners(args);
        listeners.starting(bootstrapContext, this.mainApplicationClass);
        try {
            ApplicationArguments applicationArguments = new DefaultApplicationArguments(args);
            ConfigurableEnvironment environment = prepareEnvironment(listeners, bootstrapContext, applicationArguments);
            Banner printedBanner = printBanner(environment);
            context = createApplicationContext();
            context.setApplicationStartup(this.applicationStartup);
            prepareContext(bootstrapContext, context, environment, listeners, applicationArguments, printedBanner);
            refreshContext(context);
            afterRefresh(context, applicationArguments);
            Duration timeTakenToStartup = Duration.ofNanos(System.nanoTime() - startTime);
            if (this.logStartupInfo) {
                new StartupInfoLogger(this.mainApplicationClass).logStarted(getApplicationLog(), timeTakenToStartup);
            }
            listeners.started(context, timeTakenToStartup);
            callRunners(context, applicationArguments);
        }
        catch (Throwable ex) {
            if (ex instanceof AbandonedRunException) {
                throw ex;
            }
            handleRunFailure(context, ex, listeners);
            throw new IllegalStateException(ex);
        }
        try {
            if (context.isRunning()) {
                Duration timeTakenToReady = Duration.ofNanos(System.nanoTime() - startTime);
                listeners.ready(context, timeTakenToReady);
            }
        }
        catch (Throwable ex) {
            if (ex instanceof AbandonedRunException) {
                throw ex;
            }
            handleRunFailure(context, ex, null);
            throw new IllegalStateException(ex);
        }
        return context;
    }
}
```



