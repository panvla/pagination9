import { Page } from './page';

export interface ApiResponse {
  timeStamp: string;
  statusCode: number;
  status: string;
  message: string;
  data: { page: Page };
}
