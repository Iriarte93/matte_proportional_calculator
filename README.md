# Matte Proportional Calculator

A Java-based (Java 17) tool to estimate the real-world height of distant objects using **similar triangles** and proportional measurements.

Simple but effective, I have been using this tool in several projects over the years as a Digital Matte Painter. Useful for photographers, matte painters, VFX artists, and anyone working with perspective scaling.

---

## How It Works

The application calculates object height with a simple proportional formula:
```bash
H = D × (h_object / h_total
```

Where:

- `H` = Real height of the object  
- `D` = Distance to the object (user input, determines the output unit)  
- `h_object` = Height of the object on your reference scale (e.g., a visible ruler in the camera frame)  
- `h_total` = Total height of the scale visible in the frame  

This method relies on **triangles similarity**: the ratio of the object to the reference scale in the image is the same as in real life.

---

## Features

- GUI version
- Allows repeated calculations without restarting  
- Input validation to prevent errors  

---

## Installation

1. Clone the repository:
```bash
https://github.com/Iriarte93/matte_proportional_calculator
