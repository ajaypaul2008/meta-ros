DESCRIPTION = "RealSense Camera package allowing access to Intel 3D D400 cameras"
SECTION = "devel"
LICENSE = "Apache 2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "librealsense2 image-transport nav-msgs nodelet genmsg roscpp sensor-msgs std-msgs message-runtime tf dynamic-reconfigure diagnostic-updater cv-bridge ${PYTHON_PN}-rospkg"

require realsense-ros.inc
