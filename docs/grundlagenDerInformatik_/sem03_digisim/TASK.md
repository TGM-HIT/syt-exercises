---
hide:
  - navigation
---

# "*Digital Logic Sim*" - Taskdescription


## Kompetenzzuordnung

#### SYT3 Grundlagen der Informatik - Computerarchitekturen

* CPU - den Aufbau und den grundlegenden Befehlsablauf eines Prozessors beschreiben

## Detaillierte Aufgabenbeschreibung

Bitte versuche alle wichtigen Information kurz und prägnant in einem Grafiz zu verschriftlichen.

[Digital Logic Sim](https://sebastian.itch.io/digital-logic-sim)

[Youtube Playlist](https://www.youtube.com/playlist?list=PLFt_AvWsXl0dPhqVsKt1Ni_46ARyiCGSq)

### ALU

1. Ein IN-1 --> NAND (von dem einen Eingang in beide NAND Eingänge)

| A    | NOT  |
| ---- | ---- |
| 0    | 1    |
| 1    | 0    |

2. AND: NAND --> NOT

| A    | B    | AND  |
| ---- | ---- | ---- |
| 0    | 0    | 0    |
| 0    | 1    | 0    |
| 1    | 0    | 0    |
| 1    | 1    | 1    |

3. OR: NOT/NOT --> NAND

| A    | B    | AND  |
| ---- | ---- | ---- |
| 0    | 0    | 0    |
| 0    | 1    | 1    |
| 1    | 0    | 1    |
| 1    | 1    | 1    |

4. XOR (OR+NAND --> AND)

![XOR](sources/XOR.png)



5. ADDER

![WT Halbaddierer](sources/WT Halbaddierer.png)

| CARRY IN | A    | B    | CARRY | SUM  |
| -------- | ---- | ---- | ----- | ---- |
| 0        | 0    | 0    | 0     | 0    |
| 0        | 0    | 1    | 0     | 1    |
| 0        | 1    | 0    | 0     | 1    |
| 0        | 1    | 1    | 1     | 0    |
| 1        | 0    | 0    | 0     | 1    |
| 1        | 0    | 1    | 1     | 0    |
| 1        | 1    | 0    | 1     | 0    |
| 1        | 1    | 1    | 1     | 1    |

![Addierer](sources/ADDER.png)

5. 4Bit ADDER

![4Bit ADDER](sources/4Bit ADDER new.png)

6. ALU

![ALU](sources/ALU.png)

### Register

1. SR LATCH (2. Video)

![SR LATCH](sources/SR LATCH.png)

2. NOR

![NOR](sources/NOR.png)

3. D LATCH

![D LATCH](sources/D LATCH.png)

4. REGISTER

![REGISTER](sources/REGISTER.png)

5. D-FLIP-FLOP

![D FLIP-FLOP](sources/D FLIP-FLOP.png)

6. 1-BIT REGISTER

![1-BIT REGISTER](sources/1-BIT REGISTER.png)

7. 4-BIT REGISTER

![4-BIT REGISTER](sources/4-BIT REGISTER.png)

### 7-Segment Display

1. 7 Segment Driver

![7S Driver](sources/7S Driver.png)

### Bus and Tri-State

1. Bus Buffer

![BUS Buffer](sources/BUS Buffer.png)

2. Simple CPU

![Simple CPU](sources/Simple CPU.png)

---

**Version**  *20240814v2*
