# Matte Proportional Calculator

A Java-based tool to estimate the real-world height of distant objects using **similar triangles** and proportional measurements. Useful for photographers, matte painters, VFX artists, and anyone working with perspective scaling.

---

## How It Works

The application calculates object height with a simple proportional formula:

H = D × (h_object / h_total


Where:

- `H` = Real height of the object  
- `D` = Distance to the object (user input, determines the output unit)  
- `h_object` = Height of the object on your reference scale (e.g., a visible ruler in the camera frame)  
- `h_total` = Total height of the scale visible in the frame  

This method relies on **triangles similarity**: the ratio of the object to the reference scale in the image is the same as in real life.

---

## Features

- Console and GUI versions included  
- Allows repeated calculations without restarting  
- Input validation to prevent errors  
- Optional image panel for a schematic diagram (GUI version)

---

## Installation

1. Clone the repository:


