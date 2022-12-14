#!/usr/bin/env python

import sys

for line in sys.stdin:
    cj, mj = [float(el) for el in line.split()]
    break

for line in sys.stdin:
    ck, mk, = [float(el) for el in line.split()]
    mi = (cj*mj + ck*mk) / (cj + ck)
    cj, mj = ck, mi

print("Map-Reduce mean: " + str(mj))
