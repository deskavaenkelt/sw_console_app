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

- [ ] Racer
  - [ ] String name
  - [ ] int speed
  - [ ] int integrity
  - [ ] status()
  - [ ] isFunctional()
  - [ ] abstract takeDamage()
  - [ ] abstract speedBoost()

### Klasser

- [x] Helper implements Helpers
- [ ] PodRacer extends Racer
- [ ] Race
  - [x] While logik med max 100 ronder
  - [ ] Podracers
  - [ ] Instansiera podracers
  - [ ] Speed increase
  - [ ] takeDamage
