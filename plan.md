# Plan

## Ursprunglig implementation

- Helper
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

- [x] Helpers
    - [x] randomInt()
    - [x] sleepForMilliSeconds()

### Abstrakta klasser

- [x] Racer
  - [x] String name
  - [x] int speed
  - [x] int health
  - [x] status()
  - [x] isFunctional()
  - [x] abstract takeDamage()
  - [x] abstract speedBoost()

### Klasser

- [x] Helper implements Helpers
- [x] PodRacer extends Racer
- [x] Race
  - [x] While logik med max 100 ronder
  - [x] Podracers Array
  - [x] Instansiera podracers
  - [x] Speed increase
  - [x] takeDamage
