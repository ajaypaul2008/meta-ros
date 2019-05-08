SRC_URI = "https://github.com/IntelRealSense/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

#v2.2.3
#SRC_URI[md5sum] = "fc286bfe7ae51d1f24d1858c08312e98"
#SRC_URI[sha256sum] = "93e5e3d36a3a2b18606d0b8b7596934e69b075514dfdd7652e93274db337a98d"

#v2.0.4
SRC_URI[md5sum] = "e804dabcede428645df4461062b78953"
SRC_URI[sha256sum] = "5966d127edf7e58cc6ba22d7e9bd91e56a478df229eb11a88c7886ce0fc1af26"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "realsense-ros"
