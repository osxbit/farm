import { DragDropProvider, DragDropSensors, useDragDropContext, createDraggable, createDroppable} from "@thisbeyond/solid-dnd";
import { createSignal, Show } from "solid-js";

const Sensor = (props) => {
  const draggable = createDraggable(props.id);
  return (
    <div 
      className="draggable"
      use:draggable>
      Sensor
    </div>
  )
};

const Droppable = (props) => {
  const droppable = createDroppable(props.id);
  return (
    <div 
      use:droppable
      className="droppable">
      Area 1
    </div>
  )
};

const Sandbox = () => {
  const [, { onDragEnd }] = useDragDropContext();

  onDragEnd(({draggable, droppable}) => {
    if (droppable) {
      
    }
  });

  return (
    <div>
      <Sensor id="draggable-1" />
      <Droppable id="droppable-1" />
    </div>
  );
};
  

function Sensors() {
  return (
    <DragDropProvider>
      <DragDropSensors>
        <Sandbox />
      </DragDropSensors>
    </DragDropProvider>
    );
}

export default Sensors
