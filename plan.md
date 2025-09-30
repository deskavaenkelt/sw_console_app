# Plan

## Ursprunglig implementation

- Helper (Static)
  - randomInt()
  - sleepForMilliSeconds()
- PodRacer
  - String name
  - int speed
  - int integrity
  - status()
  - isFunctional()
  - takeDamage()
  - speedBoost()
- Race
  - start()

## Ny implementation

### Interfaces

- Helpers
    [resources](src/main/resources)- randomInt()
    - sleepForMilliSeconds()

### Abstrakta klasser

- Racer
  - String name
  - int speed
  - int integrity
  - status()
  - isFunctional()
  - abstract takeDamage()
  - abstract speedBoost()

### Klasser

- Helper implements Helpers
- PodRacer extends Racer
- Race
