# Contracting

This document contains initial information for this project necessary for the first contact with it. Through this you will find information such as requirements, architectural decisions and records of discussions held

## Overview

Finding the best drugs for certain diseases is a difficult challenge. To solve this, animal testing continues to be an option, yet following behavioral manifestations after administration of certain substance is tedious, time and attention consuming from the experts. Different tracking software applications, from high-cost commercial services to open-source applications, are available.

Panadeiro et al [[doi:10.1038/s41684-021-00811-1](https://doi.org/10.1038/s41684-021-00811-1)] identified a series of features and limitations provided by 28 free software applications used for animal tracking. The features are spread across general and detection-based items as follows:

- Must-have general features:

    - Last update: 39% (11) of them were last updated between 2019 and 2023.

    - Platform: 42% (12) of them support at least 2 operating systems.

    - User friendly: 28% (8) of them are user friendly.

    - Image Acquisition: 17% (5) of them can support both live and offline image acquisition.

    - Calibration: 32% (9) of them support calibration and only 10% (3) of them can automatically calibrate.

- Must-have detection-based features

    - Background subtraction: 75% (21) of them use various ways to identify and remove the background as a preliminary computation for detection.

    - Segmentation: 57% (16) of them use more advanced algorithms than static or dynamic thresholding, edge filtering or ellipse fitting.

    - Species: 57% (16) of them can detect any kind of species.

### Related work

- ABC Tracker (2020)
- Animapp (2020)
- anTraX (2020)
- IdTracker (2020)
- MARGO (2020, https://github.com/de-Bivort-Lab/margo)
- Mouse Tracking (2019)
- Pathtrackr (2019)
- RAT (2020)
- ToxTrac (2021)
- Tracktor (2019)
- UMATracker (2019, http://ymnk13.github.io/UMATracker/)

## Requirements

- users do not need to know programming to define and use sensors

- users can use existing sensors or define new sensors to measure:
    - time
        - in defined range (square, circle, polygon)
        - near border
        - out of range
        - out of border
    - counters
        - border crossing
        - border hit
        - range hit
    - speed
        - granular speed
            > a time interval is defined for which we regularly calculate the average speed and put the values in an available array at the end)
        - instant speed (real-time)
        - average overall speed
        - speed in range
        - speed between ranges (border crossing)
    - movements shapes
        > clasification for particular or overall movement / in-range shapes
        - oval
        - circle
        - square
        - polygon
        - irregular
    - distance
        - distance in range
        - overall distance
        - individual range distances
        - distance out of range
    - heatmap
        - overall
        - in range
        - out of rang

- sensors must be able to be mixed and placed anywhere on the layout, but the same sensors configured in the same way cannot be placed in the same place

- the characteristics of a sensor are
    - the position
    - type
    - functionality
    - the activation method

- automatic identification of the layout, segmenting several frames from the recording, and then the templates for partitioning the layout should be based on the shape identified in this step

- identifying the areas of compartmentalization, producing a heatmap first with the way the subject moved. Thus, if there are 3 red areas, then we calculate the distances between the centers and place some borders in the middle of these distances

- automatic selection of video processing algorithms, such as background extraction or contour identification
    > We run 1 iteration with each combination and use the one with the best results

- users work on a simplified layout, here they also add sensors, and the processing correlates the schematic layout with the real shape of the box

- the possibility to process videos and obtain data, in accelerated mode, without seeing the entire recording

- construction of graphs and statistics, also automatically

- multiple sources for input images

## Team Roles

Coordinator: Vlad Craciun

- Scientific coordinator, ensures and directs the development of the project

Lead: Adrian Valentin Panaintescu

- Facilitates communication between the scientific coordinator and the rest of the team

- It ensures the proper development of the product

- Focused on the overall development and integration of the software and handling eadge cases

Dev: Dragoș Baciu

- Focused on the development of the graphical interface of the end user and the workflow and usage scenarios

Dev: Eduard Alexandru Baciu

- Focused on software sensors, taken from video processing to the emission of datastreams and their collection

Dev: Claudiu Catalin Strimbei

- Focused on the video processing side, from sampling to crowled information
